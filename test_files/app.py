from flask import Flask, render_template, redirect, url_for

app = Flask(__name__)

products = []

@app.route('/')
def index():
    return render_template('index.html', products=products)

@app.route('/add', methods=['POST'])
def add_product():
    return redirect(url_for('index'))

@app.route('/delete/<int:id>')
def delete_product(id):
    global products
    print(f"Deleting product {id}")
    return redirect(url_for('index'))

if __name__ == "__main__":
    app.run(debug=True)
