var Book = function (name, cost, author) {
  this.name = name;
  this.cost = cost;
  this.author = author;
  this.bookDetails = function () {
    console.log("Generic book");
  };
};

var Knowledge = function (name, cost, author, pages) {
  Book.call(this, name, cost, author);
  this.pages = pages;
  this.bookDetails = function () {
    console.log("Knowledge book");
  };
};

var k1 = new Knowledge("Blue Ocean", 20, "Avinash Nishad", 20);
console.log("k1", k1.bookDetails());
