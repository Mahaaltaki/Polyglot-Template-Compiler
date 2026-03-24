from flask import Flask

app = Flask(__name__)

@app.route("/home")
def my_page():
    return "Home"

@app.route("/about")
def my_page():
    return "About"
