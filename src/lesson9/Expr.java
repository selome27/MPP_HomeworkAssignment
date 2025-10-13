package lesson9;

sealed interface Expr permits Constant,Add,Multiply{}

