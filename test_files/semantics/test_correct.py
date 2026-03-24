from flask import Flask

app = Flask(__name__)

products = []

@app.route("/")
def index():
    return "Home Page"

@app.route("/add")
def add_item():
    global products
    products.append("New Item")
    return "Added"

if __name__ == "__main__":
    app.run()
