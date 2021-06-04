export class ArgumentError extends Error {
  value?: any;

  name: string;

  constructor(message: string, value: any = 'not specified') {
    super(message);
    this.value = value;
    this.name = this.constructor.name;
  }

  toString(): string {
    let logLineDetails = ((new Error().stack)!.split("at ")[3]).trim();
    return `ERROR: ${new Date().toUTCString()},\n${logLineDetails},\n${this.message}, value: ${this.value}`;
  }
}

export function readPossibleError(cb: () => any) {
  try {
    return cb();
  } catch (error) {
    console.error(error.toString());
    throw error;
  }
}
