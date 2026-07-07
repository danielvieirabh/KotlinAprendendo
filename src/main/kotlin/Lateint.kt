class DataBase {
    fun openConnection() {
        println("Conexão estabelecida")
    }
}

class Server {
    var nome: String? = ""
   lateinit var db: DataBase//inicia tardeamente

    fun initServer() {
       // db = DataBase()
        if (!::db.isInitialized) {
            db = DataBase()
        }
        db.openConnection()
    }
}

fun main() {
    val server = Server()
    server.initServer() //Abre a conexao
}