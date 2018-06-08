package demo;

import templates.Index;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        get("/", (req, res) -> Index.render());
    }
}
