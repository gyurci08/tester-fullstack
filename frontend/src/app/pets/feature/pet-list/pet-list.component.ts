import {Component, OnInit} from '@angular/core';
import {Pet} from '../../data/pet';
import {PetService} from '../../data-access/pet.service';
import {Observable} from 'rxjs';
import {AsyncPipe, NgForOf} from '@angular/common';

@Component({
  selector: 'app-pet-list',
  imports: [
    AsyncPipe,
    NgForOf
  ],
  templateUrl: './pet-list.component.html',
  styleUrl: './pet-list.component.scss'
})
export class PetListComponent implements OnInit {
  pets$: Observable<Pet[]>;

  constructor(private petService: PetService) {
    this.pets$=petService.getPets();
  }

  ngOnInit() {

  }
}
