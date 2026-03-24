from flask import Flask

app = Flask(__name__)

@app.route("/profile")
def profile1():
    return "Profile 1"

@app.route("/profile")
def profile2():
    return "Profile 2"
