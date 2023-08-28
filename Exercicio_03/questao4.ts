function formatar_string(array: number[]): string {
    let string = '';
    
    array.forEach((number, index) => {
      string += number;
  
      if (index !== array.length - 1) {
        string += '-';
      }
    });
  
    return string;
  }
 
  