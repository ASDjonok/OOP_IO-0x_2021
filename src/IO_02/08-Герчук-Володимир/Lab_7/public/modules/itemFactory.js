"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const accessories_1 = __importDefault(require("./items/accessories"));
const peony_1 = __importDefault(require("./items/peony"));
const rose_1 = __importDefault(require("./items/rose"));
const snowdrop_1 = __importDefault(require("./items/snowdrop"));
const itemFactory = {
    createAccessory: (stats) => new accessories_1.default(stats),
    growPeony: (stats) => new peony_1.default(stats),
    growRose: (stats) => new rose_1.default(stats),
    growSnowdrop: (stats) => new snowdrop_1.default(stats),
};
exports.default = itemFactory;
