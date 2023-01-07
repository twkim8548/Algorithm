# [Bronze II] Banking - 11078 

[문제 링크](https://www.acmicpc.net/problem/11078) 

### 성능 요약

메모리: 18464 KB, 시간: 124 ms

### 분류

구현(implementation)

### 문제 설명

<p>Internet banking sites have a variety of methods to authenticate their users. The methods usually involve passwords or Personal Identification Numbers (PINs) together with a mechanism to verify that a person is attempting to authenticate rather than a computer program.</p>

<p>The Actuarial Commerce Merchant bank has a scheme where, when you login, you are provided with a “pattern word”, containing only upper and lower case letters. You must use this pattern word to extract and sum digits from your PIN as follows.</p>

<p>Letters in the pattern word are to be interpreted as numbers, with a (or A) = 1, b (or B) = 2, ... z (or Z) = 26. A lower case letter specifies a count of digits to extract from the PIN while an upper case letter specifies a counts of digits to be skipped. The letters in the pattern word are processed from left to right resulting in a sequence of extracted digits, which are added together to yield a number. You then enter that number into a field on the web page form to authenticate yourself. For example, if your PIN was 1093373, and the pattern provided to you was aBcA you would extract one digit (namely 1) skip two digits (09), extract 3 digits (337) and then skip 1 digit (3), before totalling the extracted digits (1337) and entering 14 into the field on the web page form.</p>

<p>The bank allows you to have a PIN containing up to 256 digits and they intend to provide a pattern word in which the letters, when interpreted as numbers, sum to the length of the PIN. However, sometimes they get this wrong!</p>

<p>Write a program that reads a PIN and a pattern word and outputs the sum of the digits extracted from the PIN if the pattern is valid or outputs non sequitur if the length of the PIN and the length indicated by the pattern are different.</p>

### 입력 

 <p>The input contains a single test case.</p>

<p>The first line of input will contain an n-digit PIN, 6 ≤ n ≤ 256. The second line will contain an m-digit pattern word containing only upper and lower case letters, 1 ≤ m ≤ 256.</p>

### 출력 

 <p>The test case will produce one line of output being either the sum of the extracted digits from the PIN if the pattern word is valid or the text non sequitur if the pattern is invalid.</p>

