import org.com.kube

def call(String name = 'User') {
    echo "Welcome, ${name}."
    def kube = kube.Kube()
    kube.login()
}