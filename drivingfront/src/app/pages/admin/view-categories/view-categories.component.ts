import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { CategoryService } from 'src/app/services/category.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-view-categories',
  templateUrl: './view-categories.component.html',
  styleUrls: ['./view-categories.component.css']
})
export class ViewCategoriesComponent implements OnInit,OnDestroy {
  categorySubscription: Subscription
  categories: any[];

  constructor(private _category: CategoryService) { }

  ngOnInit(): void {
    this.categorySubscription = this._category.categories().subscribe((data: any) => {
      this.categories = data;

      
    },
      (error) => {
        
        Swal.fire('Error!', 'Error in loading data', 'error');
      });

  }
  ngOnDestroy(): void {
    this.categorySubscription.unsubscribe()
  }
}