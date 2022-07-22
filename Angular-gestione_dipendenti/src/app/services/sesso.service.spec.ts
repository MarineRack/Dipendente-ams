/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { SessoService } from './sesso.service';

describe('Service: Sesso', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SessoService]
    });
  });

  it('should ...', inject([SessoService], (service: SessoService) => {
    expect(service).toBeTruthy();
  }));
});
