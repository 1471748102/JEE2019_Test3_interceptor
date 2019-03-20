## 实验三 拦截器
### 实验目的
1. 理解拦截器的作用，并能开发拦截器。
2. 在Struts2中进行异常处理。
3. 学会建立全局结果和自定义结果。理解二者之间的关系。
### 实验内容
完成以下任务，实验报告只写第1题，只写主要代码。
1. 建立一个拦截器，用户名后缀为“r”的才允许访问“/sec”命名空间下的所有action。（拦截器、struts.xml，需要定义拦截器堆栈、缺省拦截器引用等）
2. 在以上验证用户是否合法的程序中，利用Math.random()产生一个随机数，大于0.5时抛出SQLException异常，其它情况时抛出IOException异常。在struts.xml中定义SQLException和IOException的异常处理，一个在全局进行异常处理，一个在action中定义。（action、struts.xml）