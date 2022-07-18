import { Component} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-recupero-password',
  templateUrl: './recupero-password.component.html',
  styleUrls: ['./recupero-password.component.css']
})
export class RecuperoPasswordComponent {
  constructor(private router: Router, private route: ActivatedRoute,fb:FormBuilder) {
    this.recupero=fb.group({
      email:['',Validators.required]
    })
  }
  
  recupero:FormGroup;



  
  submit(){
  
  console.log(this.recupero.value.email)
  this.router.navigate(['/controllaemail'], { relativeTo: this.route });
  
  
  }


}
