import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'pets',
    loadChildren: () => import('./pets/feature/pet-shell/pet-shell.module').then(m => m.PetShellModule)
  }
];
