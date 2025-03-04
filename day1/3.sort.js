let arr = [1, 2, 3, 4, 5, 7, 6];
console.log("before swapping\n", arr);

for (let i = 0; i <= arr.length - 1; i++) {
	console.log("--Outer loop", arr);
	console.log(" ");
	for (let j = 0; j < arr.length - 1 - i; j++) {
		console.log(`----comparison arr${j+1} < arr${j} = ${arr[j+1]} < ${arr[j]}`);
		console.log(" ");
		if (arr[j] > arr[j + 1]) {
			let temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
			console.log("------After swapping", arr);
			console.log(" ");
		}
	}
}

console.log("after swapping", arr);

