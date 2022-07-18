import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RilevazioneOreComponent } from './rilevazione-ore.component';

describe('RilevazioneOreComponent', () => {
  let component: RilevazioneOreComponent;
  let fixture: ComponentFixture<RilevazioneOreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RilevazioneOreComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RilevazioneOreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
