import { Component, OnInit, Input, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  inputs: [`pdata`], //parent to child
  outputs: [`cevent`], //child to parent
})
export class ChildComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  pdata: string = ''; //parent to child
  //child tp parent
  cevent = new EventEmitter<string>();

  onChange(value: string) {
    this.cevent.emit(value);
  }
}
