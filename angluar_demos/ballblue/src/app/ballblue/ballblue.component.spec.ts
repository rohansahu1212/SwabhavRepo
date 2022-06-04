import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BallblueComponent } from './ballblue.component';

describe('BallblueComponent', () => {
  let component: BallblueComponent;
  let fixture: ComponentFixture<BallblueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BallblueComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BallblueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
