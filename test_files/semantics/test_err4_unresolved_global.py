from flask import Flask

app = Flask(__name__)

@app.route("/delete")
def delete_item():
    global products 
    return "Deleted"
