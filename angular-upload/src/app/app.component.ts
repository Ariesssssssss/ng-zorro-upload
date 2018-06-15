import { Component } from '@angular/core';
import {NzMessageService, UploadFile} from 'ng-zorro-antd';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  fileList = [
    {
      uid: -1,
      name: 'xxx.png',
      status: 'done',
      url: 'https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png'
    }
  ];
  previewImage = '';
  previewVisible = false;

  constructor(private msg: NzMessageService) {}

  handlePreview = (file: UploadFile) => {
    this.previewImage = file.url || file.thumbUrl;
    this.previewVisible = true;
  }
}
