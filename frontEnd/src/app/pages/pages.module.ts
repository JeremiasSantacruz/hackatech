import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { MaterialModule } from '../material/material.module';
import { TableComponent } from './table/table.component';



@NgModule({
  declarations: [
    LoginComponent,
    TableComponent
  ],
  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: [
    LoginComponent,
    TableComponent
  ]
})
export class PagesModule { }
