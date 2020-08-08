# PP Proj

This school project was created for the [PP (Programski Prevodioci 1, en. Compiler Construction 1) course][pp], 
which is part of the Bachelor's studies at the [School of Electrical Engineering][school], [University of Belgrade][uni].

This project consited of constructing a compiler for the MicroJava language (a small, object-oriented language based on Java). 
The compiler takes a MJ file containing source code and generates a bytecode file that can be executed by the MicroJava VM (pre-provided in the course).
The scanner is implemented by using JFlex, while the parser uses CUP.

The solution is implemented in four stages:
- Lexical analysis
- Syntax analysis
- Semantic analysis
- Code Generation

The project was built based on the starter code written in the course exercises. 
The sepcification of the MicroJava language is given in [mikrojava_1718_jan.pdf][mj] located in the `docs` folder, along with the project statement which is in [pp1-1718-jan.pdf][statement] 
(both docs are in Serbian).

The `tests` folder contains some examples of a programs written in MicroJava that can be successfully compiled and executed.

[pp]: http://ir4pp1.etf.rs/
[school]: https://www.etf.bg.ac.rs/
[uni]: https://www.bg.ac.rs/
[mj]: ./docs/mikrojava_1718_jan.pdf
[statement]: ./docs/pp1-1718-jan.pdf
