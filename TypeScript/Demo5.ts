//   function getTotal(one:number,two:number):number{
//     return one+two
//   }
//   const total:number=getTotal(1,2)
  function sayHello() : void{
    console.log('Hello world')
  }

  function errorFuntion():never{
    throw new Error()
    console.log('Hello World')
  }
  function forNever():never{
    while(true){}
    console.log('Hello world')
  }
  function add({ one ,two }:{one:number,two:number}){
    return one +two
  }
  const totla =add({one:1,two:2})
  function getNumber({one}){
    return one 
  }
  const one =getNumber({one:1})