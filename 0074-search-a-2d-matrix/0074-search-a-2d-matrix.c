

bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){

    int start=0,row=matrixSize,column=*matrixColSize;
    int end=row*column-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        int r=mid/(column),c=mid % column;
        if(matrix[r][c]==target)
            return true;
        else if(matrix[r][c]<target)
            start=mid+1;
        else
            end=mid-1;
    }
    return false;
}