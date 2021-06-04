exports.ArgumentError = class ArgumentError extends Error {
  constructor(message, value = 'not specified') {
    super(message);
    this.value = value;
    this.name = this.constructor.name;
  }

  toString() {
    const logLineDetails = ((new Error().stack).split('at ')[3]).trim();
    return `ERROR: ${new Date().toUTCString()},\n${logLineDetails},\n${this.message}, value: ${this.value}.`;
  }
};

exports.readPossibleError = function readPossibleError(cb) {
  try {
    return cb();
  } catch (error) {
    console.error(error.toString());
    throw error;
  }
};
