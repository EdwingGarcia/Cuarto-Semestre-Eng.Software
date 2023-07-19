

def bubble_sort(my_list):
    for i in range(len(my_list)-1,0,-1):
        for j in range(i):
            if my_list[j]>my_list[j+1]:
                temp=my_list[j]
                my_list[j]=my_list[j+1]
                my_list[j+1]=temp
    return my_list

def selection_sort(my_list):
    for i in range (len(my_list)-1):
        min_index=i
        for j in range(i+1,len(my_list)):
            if my_list[j]<my_list[min_index]:
                min_index=j
        if i!= min_index:
            temp=my_list[i]
            my_list[i]=my_list[min_index]
            my_list[min_index]=temp
    return my_list

def insertion_sort(my_List):
    for i in range(1,len(my_List)):
        temp=my_List[i]
        j=i-1 
        while temp<my_List[j] and j>-1:
            my_List[j+1]=my_List[j]
            my_List[j]=temp
            j-=1
    return my_List















print(insertion_sort([4,2,6,5,1,3]))