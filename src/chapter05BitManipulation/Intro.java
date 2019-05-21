package chapter05BitManipulation;

/**
 * 
 * Bit Facts and Tricks
 * x ^ 0s = x       x & 0s = 0		x | 0s = x
 * x ^ 1s = ~x		x & 1s = x		x | 1s = 1s
 * x ^ x = 0		x & x = x 		x | x = x
 * 
 * The binary representation of -K as a N-bit number is concat(1, 2(N-1) -k).
 * 7: 0111;  -1: 1111
 * 
 */