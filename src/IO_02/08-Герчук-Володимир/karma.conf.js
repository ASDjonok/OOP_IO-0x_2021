module.exports = function(config) {
  config.set({
    basePath: '',
    frameworks: ['jasmine', 'browserify'],
    files: [
      'Lab_6/**/*.js',
      '**/**/*.spec.js',
    ],
    exclude: [ ],
    preprocessors: {
      '**/**/*.js': ['browserify'],
      '**/**/*.spec.js': ['browserify']
    },
    browserify: {
      configure: function(bundle) {
        bundle.transform(require('browserify-istanbul')({
          ignore: ['**/spec/**/*.spec.js']
        }));
      }
    },
    plugins: [
        require('karma-jasmine'),
        require('karma-chrome-launcher'),
        require('karma-spec-reporter'),
        require('karma-jasmine-html-reporter'),
        require('karma-coverage'),
        require('karma-browserify')
    ],
    reporters: ['spec','kjhtml','coverage'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_DISABLE,
    autoWatch: true,
    browsers: ['Chrome'],
    client: {
      clearContext: false
    },
    singleRun: false,
    concurrency: Infinity,
  })
}