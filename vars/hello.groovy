import org.com.kube.Kube

def call(String name = 'User') {
    echo "Welcome, ${name}."
    def kube = Kube()
    kube.login()
}