import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginaControllaEmailComponent } from './pagina-controlla-email.component';

describe('PaginaControllaEmailComponent', () => {
  let component: PaginaControllaEmailComponent;
  let fixture: ComponentFixture<PaginaControllaEmailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaginaControllaEmailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PaginaControllaEmailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
