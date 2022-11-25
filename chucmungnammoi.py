
import array as arr
n = int(input())
arr = []
for i in range(0, n):
    arr.append(str(input()))
demkq = 0
for i in range(0, n-1):
    if arr[i] != 'loai':
        demkq +=1
        for j in range(i+1, n):
            if(arr[j] != 'loai'):
                if len(arr[i]) == len(arr[j]):
                    dem = 0
                    for z in range(0, len(arr[i])):
                        if ord(arr[i][z]) == ord(arr[j][z]):
                            dem+=1
                        else:
                            break
                    if dem == len(arr[i]):
                        arr[j] = 'loai'
if arr[n-1] != 'loai':
    demkq += 1
print(demkq)