
/*def ant = new AntBuilder()
ant.zip(destfile: "", basedir : "")

def file = new File()*/

/*def t = 'ls -l'.execute() | ['awk', '{print $3}'].execute() | 'while read b; do echo \"hello  $b\"; done'.execute()
t.waitFor()
println p.text*/


def cmd = [
        'bash',
        '-c',
        '''ps aux | awk '{print $3}' | while read b; do echo "hello  $b"; done''' ]

println cmd.execute().text


show = { println it }
square_root = { Math.sqrt(it) }

def please(action) {
    [the: { what ->
        [of: { n -> action(what(n)) }]
    }]
}

// equivalent to: please(show).the(square_root).of(100)
//please show the square_root of 100
please show the square_root of 4

def sh(script) {
    def result = ['bash', '-c', script].execute().text
    println result
}

sh("curl http://www.google.com.sg")