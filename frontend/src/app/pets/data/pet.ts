import {AutoAssign} from '../../shared/decorators/auto-assign.decorator';


@AutoAssign()
export class Pet {
  id!: number;
  name!: string;
  type!: string;
}
