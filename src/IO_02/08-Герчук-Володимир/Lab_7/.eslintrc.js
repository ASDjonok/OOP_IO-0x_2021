module.exports = {
  env: {
    browser: true,
    commonjs: true,
    es2021: true,
    node: true,
  },
  extends: [
    'airbnb-base',
  ],
  parser: '@typescript-eslint/parser',
  parserOptions: {
    ecmaVersion: 12,
  },
  plugins: [
    '@typescript-eslint',
  ],
  ignorePatterns: ['*.d.ts', '.*', 'test', '*.conf*', 'jasmine.js'],
  rules: {
    'class-methods-use-this': 'off',
    'import/extensions': 'off',
    'no-plusplus': 'off',
    'no-continue': 'off',
    'import/no-unresolved': 'off',
    radix: ["error", "as-needed"]
  },
  globals: {
    FlowerConstructorConf: "readonly",
    AccessorieConstructorConf: "readonly",
    FlowerConstructorWithKoef: "readonly",
  }
};
