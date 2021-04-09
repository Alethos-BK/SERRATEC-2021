var x = 6.0;
var y = 2;
var z = 4.000;
var a = 8;
var b = 7.5;
var c = 12;

console.log("x = 6, y = 2, z = 4, a = 8, b = 7.5, c = 12");

var A = (x - y) > a;
console.log("a - y > a ", A);

var B = (x - y * a) > (c % y);
console.log("(x - y * a) > (c % y) ", B);

var C = y != c;
console.log("y != c ", C);

var D = (x * y) != c;
console.log("(x *z) != c ", D);

var E = (c % y) <= (y % c);
console.log("(c % y) <= (y % d) ", E);

var F = a < b;
console.log("a < b ", F);

var G = (z/a + x * y - 5 >= b);
console.log("z/a + x * y - 5 >= b ", G);

var H = (c * z +2 ) == (a * x + y);
console.log("c * z + 2 = a * x + y ", H);

var I = c == z + b;
console.log("c = z + b", I);

var J = (y * 2) != (7 - b);
console.log("(y * 2 != 7 - b", J);