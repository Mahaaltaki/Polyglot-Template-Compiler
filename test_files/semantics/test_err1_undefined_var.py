from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    y = x + 10 
    return y
