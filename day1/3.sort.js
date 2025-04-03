let arr = [1, 2, 3, 4, 5, 7, 6];
console.log("before swapping\n", arr);

for (let i = 0; i <= arr.length - 1; i++) {
	for (let j = 0; j < arr.length - 1 - i; j++) {
		if (arr[j] > arr[j + 1]) {
			let temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
		}
	}
}

console.log("after swapping", arr);

