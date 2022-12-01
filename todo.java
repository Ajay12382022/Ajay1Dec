let addToDoButton = document.getElementById('addToDo');
let toDofamily = document.getElementById('toDofamily');
let inputfamily = document.getElementById('inputfamily');

addToDoButton.addEventListener('click', function(){
    var paragraph = document.createElement('p');
    paragraph.classlist.add('paragraph-styling');
    paragraph.innerText = inputfamily.value;
    todofamily.appendchild(paragraph);
    inputfamily.value = "";
    paragraph.addEventListener('click', function() {
        paragraph.style.textDecoration = "line-through";
    })
    paragraph.addEventListener('dblclick', function() {
        todofamily.removechild(paragraph);
    })
      
}
