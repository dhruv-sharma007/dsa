let num = [1, 2, 3, 4, 5]; 
let newArr = [];

//using stack method to reverse a num

for (let i = num.length - 1; i >= 0; i -= 1) {
	newArr.push(num[i]);
}

console.log(newArr);
