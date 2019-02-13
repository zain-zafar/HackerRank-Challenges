def reverseStr(s):
	
	# Use negative indexing to reverse the string
	i = 1; 
	reversedStr = "";

	while i <= len(s):
		# Get the last letter based on i:
		reversedStr += s[-i]
		i+=1

	print(reversedStr)

if __name__ == '__main__':
	reverseStr("abc")