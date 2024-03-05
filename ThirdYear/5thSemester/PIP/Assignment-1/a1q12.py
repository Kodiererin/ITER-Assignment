# 12. An online retailer sells two products: widgets and gizmos. Each widget weighs 75 grams. Each gizmo
# weighs 112 grams. Write a program that reads the number of widgets and the number of gizmos from
# the user. Then your program should compute and display the total weight of the parts.


widgets , gizmo = int(input("Enter the No of Widget ")) , int(input("Enter The Number of Gizmo "))
print("The Total  Weight is ",widgets*75 + gizmo*112)