class Employee:
    def __init__(self,empid,salary,ename):
        self.empid=empid
        self.salary=salary
        self.ename=ename
    
    def details(self):
        print("Employee Id:",self.empid)
        print("Employee Salary : ",self.salary)
        print("Employee Name: ",self.ename,"\n")
s1 = Employee(101,5000000,"Sarthak")
s2 = Employee(102,4000000,"Sanskar")
s3 = Employee(102,50,"Sital")
s1.details()
s2.details()
s3.details()