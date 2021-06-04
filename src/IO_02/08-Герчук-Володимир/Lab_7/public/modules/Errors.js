"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.readPossibleError = exports.ArgumentError = void 0;
class ArgumentError extends Error {
    constructor(message, value = 'not specified') {
        super(message);
        this.value = value;
        this.name = this.constructor.name;
    }
    toString() {
        let logLineDetails = ((new Error().stack).split("at ")[3]).trim();
        return `ERROR: ${new Date().toUTCString()},\n${logLineDetails},\n${this.message}, value: ${this.value}`;
    }
}
exports.ArgumentError = ArgumentError;
function readPossibleError(cb) {
    try {
        return cb();
    }
    catch (error) {
        console.error(error.toString());
        throw error;
    }
}
exports.readPossibleError = readPossibleError;
