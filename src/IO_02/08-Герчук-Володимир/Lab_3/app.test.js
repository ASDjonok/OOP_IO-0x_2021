import { jest } from '@jest/globals';
import { Text } from './app';

const template = 'First simple string Last...';

describe('Lab-3 => Words replacing', () => {
  test('Check for the right value in str', () => {
    const commonString = new Text(template);
    expect(commonString.str).toBe(template);
  });
  test('Throw error with not a string', () => {
    expect(() => new Text(123)).toThrow(/not a string/i);
  });
  test('Split a string on words, without punctuation marks', () => {
    expect(Text.createArr(template)).toEqual(['First', 'simple', 'string', 'Last']);
    expect(Text.createArr('Some.Text.Goes-here...')).toEqual(['Some', 'Text', 'Goes', 'here']);
  });
  test('Replace first and last words accordingly', () => {
    const commonString = new Text(template);
    expect(commonString.move()).toBe('Last simple string First...')
    expect(commonString.move()).toMatch(/^first.*last/i);
  });
  test('Throw error on less than two words', () => {
    const commonString = new Text('HereErrorComes');
    expect(() => commonString.move()).toThrow(/less than two/i)
  });
});