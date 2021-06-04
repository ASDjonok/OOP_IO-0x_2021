const { ArgumentError } = require('../../Lab_7/public/modules/Errors');

const LinkedArray = require('../../Lab_7/public/modules/linkedArray').default;
const CustomNode = require('../../Lab_7/public/modules/customNode').default;

describe('Lab-7: LinkedArray module', () => {
  beforeEach(() => {
    defaultLnk = new LinkedArray();
    // length = 10
    defaultLnk.push('💩 - 0');
    defaultLnk.push('💩 - 1');
    defaultLnk.push('💩 - 2');
    defaultLnk.push('🍩 - 3');
    defaultLnk.push('💩 - 4');
    defaultLnk.push('🎁');
    defaultLnk.push('🎁');
    defaultLnk.push(123);
    defaultLnk.push({ data: 'important data 📃' });
    defaultLnk.push([ 'I`m the array 🌚' ]);

    this.defaultLnk = defaultLnk;
    this.prevLength = defaultLnk.length;
  });

  describe('head property', () => {
    it('should create head which is CustomNode instance', () => {
      const lnk = new LinkedArray();
      lnk.push('whatever data');
      expect(lnk.head instanceof CustomNode).toBeTrue();
    });
  
    it('should have `next` and `element` properties', () => {
      expect(this.defaultLnk.head.element).toBe('💩 - 0');
      expect(this.defaultLnk.head.next instanceof CustomNode).toBeTrue();
      expect(this.defaultLnk.head.next.element).toBe('💩 - 1');
    });
  });

  describe('remove method', () => {
    it('should remove given element (not a reference data type)', () => {
      expect(this.defaultLnk.length).toBe(this.prevLength);
      this.defaultLnk.remove('🎁');
      expect(this.defaultLnk.length).toBe(this.prevLength - 1);
    });
    
    it('shouldn`t remove given element if it is a reference data type', () => {
      expect(this.defaultLnk.length).toBe(this.prevLength);
      this.defaultLnk.remove({ data: 'important data 📃' });
      expect(this.defaultLnk.length).toBe(this.prevLength);
    });
    
    it('returns null when array is empty', () => {
      const lnk = new LinkedArray();
      expect(lnk.remove(123)).toBeNull();
    });
    
    it('returns null when there is no such value', () => {
      const res = this.defaultLnk.remove('no such value');
      const res2 = this.defaultLnk.remove({});
      expect(res).toBeNull();
      expect(res2).toBeNull();
    });
  });
  
  describe('indexOf method', () => {
    it('should return the index of an identical element from right to left', () => {
      expect(this.defaultLnk.indexOf('🎁')).toBe(5);
      expect(this.defaultLnk.indexOf(123)).toBe(7);
    });

    it('should return -1 if there is no such element', () => {
      expect(this.defaultLnk.indexOf({})).toBe(-1);
      expect(this.defaultLnk.indexOf([])).toBe(-1);
      expect((new LinkedArray()).indexOf('whatever 😒')).toBe(-1);
    });
  });

  describe('elementAt method', () => {
    it('should return element that is under specified index', () => {
      expect(this.defaultLnk.elementAt(4).element).toBe('💩 - 4');
      expect(this.defaultLnk.elementAt(9).element).toEqual([ 'I`m the array 🌚' ]);
    });

    it('should throw an error with index >= length', () => {
      expect(() => (new LinkedArray()).elementAt(100)).toThrow(new ArgumentError('Invalid index (100)'));
      expect(() => (this.defaultLnk.elementAt(this.prevLength))).toThrow(new ArgumentError(`Invalid index (${this.prevLength})`));
    });

    it('should throw an error with negative index', () => {
      expect(() => this.defaultLnk.elementAt(-4)).toThrow(new ArgumentError('Invalid index (-4)'));
    });
  });

  describe('addAt method', () => {
    it('should add new CustomNode with specified index', () => {
      const el = '🐱‍👤code'
      this.defaultLnk.addAt(5, el);
      expect(this.defaultLnk.elementAt(5) instanceof CustomNode).toBeTrue();
      expect(this.defaultLnk.elementAt(5).element).toBe(el);
      expect(this.defaultLnk.length).toBe(this.prevLength + 1);
    });

    it('should move previous node under +1 index', () => {
      const prevNode = this.defaultLnk.elementAt(3).element;
      this.defaultLnk.addAt(3, '💣');
      expect(this.defaultLnk.elementAt(4).element).toBe(prevNode);
    });

    it('should throw an error with idnex > length', () => {
      expect(() => (new LinkedArray()).elementAt(100)).toThrow(new ArgumentError('Invalid index (100)'));
    });

    it('should throw an error with negative index', () => {
      expect(() => this.defaultLnk.addAt(-11, '🥔')).toThrow(new ArgumentError('Invalid index (-11)'));
    });
  });

  describe('removeAt method', () => {
    it('should remove node under specified index', () => {
      this.defaultLnk.removeAt(4);
      expect(this.defaultLnk.length).toBe(this.prevLength - 1);
      this.defaultLnk.removeAt(4);
      expect(this.defaultLnk.length).toBe(this.prevLength - 2);
    });
    
    it('should return deleted node', () => {
      const node = this.defaultLnk.elementAt(4);
      const deletedNode = this.defaultLnk.removeAt(4);
      expect(node).toEqual(deletedNode);
    });

    it('should move the next node under -1 index', () => {
      const nextNode = this.defaultLnk.elementAt(5);
      this.defaultLnk.removeAt(4);
      expect(this.defaultLnk.elementAt(4)).toEqual(nextNode);
      expect(this.defaultLnk.elementAt(3).next).toEqual(nextNode);
    });
    
    it('should throw an error when index < 0', () => {
      expect(() => this.defaultLnk.removeAt(-1)).toThrow(new ArgumentError('Invalid index (-1)'));
    });
    
    it('should throw an error when index >= length', () => {
      expect(() => this.defaultLnk.removeAt(this.prevLength)).toThrow(new ArgumentError(`Invalid index (${this.prevLength})`));
    });
  });
});
