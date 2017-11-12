module.exports = function(grunt)
{
    grunt.initConfig({
		less: {
            development: {
                files: {
                    'dist/css/temp.css': 'src/less/temp.less'
					
					
                }
            }
        },
        watch: {
            less: {
                files: ['**/*.less'],
                tasks: ['less']
            },
        },

       

    });
grunt.loadNpmTasks('grunt-contrib-watch');
grunt.loadNpmTasks('grunt-contrib-less');
grunt.loadNpmTasks('grunt-contrib-jshint');


};
