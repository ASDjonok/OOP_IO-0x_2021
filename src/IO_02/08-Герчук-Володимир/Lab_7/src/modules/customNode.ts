export default class CustomNode {
  next: CustomNode | null;

  element: any;

  constructor(element: any, next: CustomNode | null = null) {
    this.element = element;
    this.next = next;
  }
}
