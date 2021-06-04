module.exports = function(config) {
  config.set({
    basePath: '',
    frameworks: ['jasmine', 'browserify'],
    files: [
      'test/Lab_*_test/*.js'
    ],
    exclude: [],
    preprocessors: {
      'test/Lab_*_test/*.js': [ 'browserify' ],
      'Lab_6/app.js': [ 'coverage' ],
    },
    plugins: [
        require('karma-browserify'),
        require('karma-jasmine'),
        require('karma-chrome-launcher'),
        require('karma-spec-reporter'),
        require('karma-jasmine-html-reporter'),
        require('karma-coverage')
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