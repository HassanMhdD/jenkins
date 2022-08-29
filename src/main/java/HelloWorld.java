import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello");
		get("/test", (req, res) -> "TEST DEPLOIEMENT JENKINS");
		get("/", (req, res) -> "test déploiement 2");

	
	
	}
}
