import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directive',
  templateUrl: './directive.component.html',
  styleUrls: ['./directive.component.css'],
})
export class DirectiveComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}
  products = [
    { name: 'admin1', email: 'admin1@gmail.com' },
    { name: 'Banu', email: 'banu@gmail.com' },
    { name: 'Sam', email: 'sw@gmail.com' },
    { name: 'deepa', email: 'deepa@gmail.com' },
    { name: 'kaviya', email: 'kaviya@gmail.com' },
    { name: 'Sahoo', email: 'sahoo@gmail.com' },
    { name: 'ram', email: 'ram@gmail.com' },
  ];

  //used for if
  flag = false;

  show() {
    this.flag = !this.flag;
  }

  //used for switch case
  public day = new Date().getDay();
}
