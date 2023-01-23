import org.com

def call(String name = 'User') {
    echo "Welcome, ${name}."
    def kube = Kube()
    kube.login()
}